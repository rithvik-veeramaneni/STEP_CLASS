package day2;

public class file_extension_validator {
    String file_extensionvalidate(String filename) {
        filename.toLowerCase();
        int lastindex = filename.lastIndexOf(".");
        String extension = filename.substring(lastindex + 1);

        if (extension == "pdf" || extension == "docx" || extension == "zip") {
            return "valid file";
        } else {
            return "invalid file";
        }

    }
}
