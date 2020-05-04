public class DecoratorMark extends PlainTextDecorator {
    public DecoratorMark(AbstractPlainText abstractPlainText) {
        super(abstractPlainText);
    }
    @Override
    public void write() {
        System.out.print("<mark> ");
        super.write();
        System.out.print(" </mark>");
    }
}
