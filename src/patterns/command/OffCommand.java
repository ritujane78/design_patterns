package patterns.command;

public class OffCommand implements Command{

  Television television;

  @Override
  public void execute() {
    television.off();
  }

  public OffCommand(Television television) {
    this.television = television;
  }
}
