package Bridge;

public class Website implements Resource{
    @Override
    public void postInformation() {
        System.out.println("Размещаем информацию на вебсайте");
    }
}
