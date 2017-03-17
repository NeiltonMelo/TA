package ta

class Evaluation {
    String origin;
    String value;
    Date applicationDate;
    Criterion criterion;
	String classroom;
    
	static constraints = {
        origin inList :["Test","Mini-Test","Form","Final"], blank: false
        value inList :["MA","MPA","MANA","--"], blank :false
        criterion nullable : false
		classroom nullable : false, blank : false, defaultValue : "Lab 11"
    }

    public Evaluation(String origin, String value, Date applicationDate, String criterion, String classroom){
        this.origin = origin;
        this.value = value;
        this.applicationDate = applicationDate;
		this.classroom = classroom;
        this.criterion = Criterion.findById(Long.parseLong(criterion));
    }

    public boolean compatibleTo(Evaluation evaluationInstance){
        if(this.origin.equals(evaluationInstance.getOrigin()) && this.value.equals(evaluationInstance.getValue()) && this.applicationDate.compareTo(evaluationInstance.getApplicationDate())==0 && this.criterion.getDescription().equals(evaluationInstance.getCriterion().getDescription()))
        {
            return true
        }else {
            return false
        }
    }
}