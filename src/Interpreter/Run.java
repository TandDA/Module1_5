package Interpreter;

public class Run {
    public static void main(String[] args) {
        Expression isCSSharpDev = getCSSharpExpression();
        Expression isCSSharpMidlDev = getCSSharpMidlExpression();
        System.out.println(isCSSharpDev.interpret(".NET Framework"));
        System.out.println(isCSSharpMidlDev.interpret("Entity Framework ASP.NET"));
    }
    public static Expression getCSSharpExpression(){
        Expression core = new TerminalExpression(".NET Core");
        Expression net_framework = new TerminalExpression(".NET Framework");
        return new OrExpression(core,net_framework);
    }
    public static Expression getCSSharpMidlExpression(){
        Expression asp = new TerminalExpression("ASP.NET");
        Expression entity_framework = new TerminalExpression("Entity Framework");

        return new AndExpression(asp,entity_framework);
    }
}
