package patterns.command;

public class OnCommand implements Command{

  Television television;

  @Override
  public void execute() {
    television.on();
  }

  public OnCommand(Television television) {
    this.television = television;
  }
}
