package MVC_package;

import java.io.File;

public class Model_File {
    private String filePath;

    public Model_File() {
        filePath = "";
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void traverseDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        traverseDirectoryRecursive(directory);
    }

    
    //Đệ quy để duyệt thư mục
    
    private void traverseDirectoryRecursive(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        traverseDirectoryRecursive(file);
                    } else {
                        // Thực hiện các thao tác mong muốn trên tệp tin
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }
}