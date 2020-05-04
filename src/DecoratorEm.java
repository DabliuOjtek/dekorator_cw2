public class DecoratorEm extends PlainTextDecorator {
    public DecoratorEm(AbstractPlainText abstractPlainText) {
        super(abstractPlainText);
    }
    @Override
    public void write() {
        System.out.print("<em> ");
        super.write();
        System.out.print(" </em>");
    }
}
