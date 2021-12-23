package ru.ashcheulov.pl0;

import com.github.bgora.rpnlibrary.Calculator;
import mikhail.ashcheulov.Pl0BaseVisitor;
import mikhail.ashcheulov.Pl0Parser;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class Pl0VisitorImpl extends Pl0BaseVisitor<Value> {

    private final Map<String, Value> memory = new HashMap<>();

    @Override
    public Value visitWritestmt(Pl0Parser.WritestmtContext ctx) {
        Value value = this.visit(ctx.ident());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitQstmt(Pl0Parser.QstmtContext ctx) {
        Scanner scanner = new Scanner(System.in);
        String id = ctx.ident().getText();
        Value value = new Value(scanner.nextInt());
        return memory.put(id,value);
    }

    @Override
    public Value visitAssignstmt(Pl0Parser.AssignstmtContext ctx) {
//        System.out.println(memory);
        if (!memory.containsKey(ctx.ident().getText())) {
            throw new IllegalArgumentException("Переменная " + ctx.ident().getText() + " не объявлена");
        }
        String id = ctx.ident().getText();
        Value value = this.visit(ctx.expr());
//        System.out.println(ctx.expression().term().size());
//        try {
//            System.out.println(id+":="+value);
//        } catch (NullPointerException ignored) {
//        }
        return memory.put(id, value);
    }

    @Override
    public Value visitNumber(Pl0Parser.NumberContext ctx) {
        return new Value(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitIdent(Pl0Parser.IdentContext ctx) {
        String id = ctx.getText();
        return memory.get(id);
    }

    @Override
    public Value visitVars_(Pl0Parser.Vars_Context ctx) {
        for (Pl0Parser.IdentContext ident : ctx.ident()) {
            var id = ident.getText();
            memory.put(id, null);
        }
//        String id = ctx.ident().getText();
        return null;
    }

    @Override
    public Value visitConsts(Pl0Parser.ConstsContext ctx) {
        for (int i = 0; i < ctx.ident().size(); i++) {
            var id = ctx.ident(i).getText();
            var value = new Value(ctx.number(i).getText());
            memory.put(id, value);
        }
        return null;
    }

    @Override
    public Value visitProcedure(Pl0Parser.ProcedureContext ctx) {
        String id = ctx.ident().getText();
        Value block = new Value(ctx.block());
        return memory.put(id, block);
    }

    @Override
    public Value visitCallstmt(Pl0Parser.CallstmtContext ctx) {
//        System.out.println("Выполнение процедуры " + ctx.ident().getText());
        Value v = this.visit(memory.get(ctx.ident().getText()).asProcedure());
//        System.out.println("-------");
        return v;
    }

    @Override
    public Value visitOpExpr(Pl0Parser.OpExprContext ctx) {
        Value left = visit(ctx.left);
        Value right = visit(ctx.right);
        String op = ctx.op.getText();
        switch (ctx.op.getType()) {
            case Pl0Parser.MUL:
                return new Value(left.asInt() * right.asInt());
            case Pl0Parser.DIV:
                return new Value(left.asInt() / right.asInt());
            case Pl0Parser.ADD:
                return new Value(left.asInt() + right.asInt());
            case Pl0Parser.SUB:
                return new Value(left.asInt() - right.asInt());
            default:
                throw new IllegalArgumentException("Unknown operator " + op);
        }
    }
//
//    @Override
//    public Value visitExpression(Pl0Parser.ExpressionContext ctx) {
//        System.out.println("Выполнение visitExpression");
//        System.out.println();
//        System.out.println("#######");
//        return null;
////        if (ctx.ADD().size()==0 && ctx.SUB().size()==0 && ctx.term().size()==1) {
////            return this.visit(ctx.term().get(0));
////        }
////        var text = ctx.getText();
////        int count;
////        if(ctx.term().size()==1) {
////            count = StringUtils.countMatches(text, ctx.term(0).factor(0).ident().getText());
////        }
////        if (count==1) {
////            return this.visit(ctx.te)
////        }
//////        Value v0 = this.visit(ctx.term(0));
////        List<Value> values = new ArrayList<>();
////        for (Pl0Parser.TermContext termContext : ctx.term()) {
////            System.out.println(termContext.getText());
////            values.add(this.visit(termContext));
////        }
////        StringBuilder builder = new StringBuilder();
////        builder.append(values.get(0).toString());
////        int i=1;
////        for (char ch : ctx.getText().toCharArray()) {
////            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
////                builder.append(ch).append(values.get(i++));
////            }
////        }
////        System.out.println(builder.toString());
////        //взять первый элемент
////        //
////        Calculator calculator = Calculator.createCalculator();
////        var r = calculator.calculate(builder.toString());
////        return new Value(r.intValue());
//    }

    @Override
    public Value visitWhilestmt(Pl0Parser.WhilestmtContext ctx) {
//        System.out.println(ctx.condition().getText());
        while (this.visit(ctx.condition()).asBoolean()) {
            this.visit(ctx.statement());
        }
        return null;
    }

    @Override
    public Value visitEquals(Pl0Parser.EqualsContext ctx) {
        Value v0 = this.visit(ctx.expr(0));
        Value v1 = this.visit(ctx.expr(1));
        return new Value(v0.value.equals(v1.value));
    }

    @Override
    public Value visitNotEquals(Pl0Parser.NotEqualsContext ctx) {
        Value v0 = this.visit(ctx.expr(0));
        Value v1 = this.visit(ctx.expr(1));
        return new Value(v0.asInt() != v1.asInt());
    }

    @Override
    public Value visitLess(Pl0Parser.LessContext ctx) {
        Value v0 = this.visit(ctx.expr(0));
        Value v1 = this.visit(ctx.expr(1));
//        System.out.println(v0);
//        System.out.println(v1);
        return new Value(v0.asInt() < v1.asInt());
    }

    @Override
    public Value visitGreater(Pl0Parser.GreaterContext ctx) {
        Value v0 = this.visit(ctx.expr(0));
        Value v1 = this.visit(ctx.expr(1));
        return new Value(v0.asInt() > v1.asInt());
    }

    @Override
    public Value visitIfstmt(Pl0Parser.IfstmtContext ctx) {
//        System.out.println(ctx.statement().getText());
//        return null;
//        System.out.println(stmt.toString());
        Value cond = this.visit(ctx.condition());
//        System.out.println(cond.toString());
        return cond.asBoolean() ? this.visit(ctx.statement()) : null;

    }

    @Override
    public Value visitOddExpr(Pl0Parser.OddExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return value.asInt() % 2 == 0 ? new Value(true) : new Value(false);
    }

}
