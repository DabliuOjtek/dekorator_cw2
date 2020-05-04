abstract class PlainTextDecorator extends AbstractPlainText {
    protected AbstractPlainText abstractPlainText;

    PlainTextDecorator(AbstractPlainText abstractPlainText){
        this.abstractPlainText = abstractPlainText;
    }

    @Override
    public void write() {
        abstractPlainText.write();
    }
}
