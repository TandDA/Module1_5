package Observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> data);
}