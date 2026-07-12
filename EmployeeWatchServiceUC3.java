import java.io.IOException;
import java.nio.file.*;

public class EmployeeWatchServiceUC3 {

    public static void main(String[] args) throws Exception {

        WatchService watchService = FileSystems.getDefault().newWatchService();

        Path path = Paths.get("C:\\Users\\R Navya\\Desktop\\Bridgelabz\\I-O-Handling");

        path.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        while (true) {

            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println(event.kind() + " : " + event.context());
            }

            key.reset();
        }
    }
}