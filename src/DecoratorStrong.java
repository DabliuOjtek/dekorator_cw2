public class DecoratorStrong extends PlainTextDecorator {
    DecoratorStrong(AbstractPlainText abstractPlainText){
        super(abstractPlainText);
    }
    @Override
    public void write() {
        System.out.print("<strong> ");
        super.write();
        System.out.print(" </strong>");
    }
}
