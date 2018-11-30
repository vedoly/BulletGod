import javafx.scene.layout.Pane;

public class EventManager {
		
	private Pane root;
	private Test test;
	
	
	public EventManager(Pane root)
	{
		this.root=root;
		this.test=new Test(400,300);
	}
	
	void drawBoard()
	{
		this.root.getChildren().add(test);
	}
}
