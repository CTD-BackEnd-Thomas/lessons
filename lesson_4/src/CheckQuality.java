public abstract class CheckQuality {

    protected CheckQuality nextCheck;
    public abstract void processesRequest(Product product);

    public CheckQuality setNextCheck( CheckQuality nextCheck){

        this.nextCheck = nextCheck;
        return this;

    }



}
