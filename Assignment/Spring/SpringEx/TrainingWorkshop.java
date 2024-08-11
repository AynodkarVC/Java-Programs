package Spring.SpringEx;

public class TrainingWorkshop implements Workshop{
    TrainingCompany trainingCompany;

    public TrainingWorkshop(){

    }

    public TrainingWorkshop(TrainingCompany trainingCompany){
        this.trainingCompany = trainingCompany;
    }

    public void setTrainingCompany(TrainingCompany trainingCompany){
        this.trainingCompany = trainingCompany;
    }

    public TrainingCompany getTrainingCompany() {
        return trainingCompany;
    }

    @Override
    public void conductWorkshop() {
        System.out.println(trainingCompany);
        trainingCompany.conductTraining();
    }
}
