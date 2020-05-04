public class DecoratorP extends PlainTextDecorator {

    DecoratorP(AbstractPlainText abstractPlainText) {
        super(abstractPlainText);
    }

    @Override
    public void write() {
        System.out.print("<p> ");
        super.write();
        System.out.print(" </p>");
    }
}
