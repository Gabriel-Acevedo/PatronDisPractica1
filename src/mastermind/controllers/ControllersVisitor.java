package mastermind.controllers;

public interface ControllersVisitor {
	
	void visit(StartController startController);
        
        void visit(PlayController controller);
	
        void visit(SaveController saveController);
        
	void visit(ResumeController continueController);
        


}
