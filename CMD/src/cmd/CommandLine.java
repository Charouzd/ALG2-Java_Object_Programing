package cmd;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CommandLine {

    private String command;
    private File actualDir;

    public CommandLine() {
        actualDir = new File(System.getProperty("user.dir"));
    }

    public String getActualDir() {
        return actualDir.getAbsolutePath();
    }

    public String parseAndExecute(String command) throws IOException {
        String[] parts = command.trim().split(" ");
        String result;
        switch (parts[0]) {
            case "mkfile":
                result = mkfile(parts[1]);
                break;
            case "help":
                result = help();
                break;
            case "dir":
                result = dir();
                break;
            case "mkdir":
                result = mkDir(parts[1]);
                break;
            case "cd":
                result = cd(parts[1]);
                break;
            case "mkdirs":
                result = mkdirs();
                break;
            case "rename":
                result = rename(parts[1], parts[2]);
                break;
            case "end":
                result = end();
                break;
            default:
                result = "Nevalidni prikaz";
        }
        return result;
    }

    private String mkfile(String filename) throws IOException {
        File f = new File(actualDir.getAbsolutePath() + File.separator + filename);
        //File f = new File(actualDir, filename);
        if (f.createNewFile()) {
            return "Soubor vytvoren";
        } else {
            return "Soubor uz existuje";
        }
    }

    public boolean isEnd() {
        return false;
    }

    private String help() {
        StringBuilder sb = new StringBuilder();
        sb.append("Use one of the following comands" + "\n");
        sb.append("dir - list current directory" + "\n");
        sb.append("mkdir <name> - make directory" + "\n");
        sb.append("cd <path> - move to directory" + "\n");
        sb.append("rename <name> <name> - rename a choosen directory" + "\n");
        sb.append("mkfile <name> - make a file" + "\n");
        sb.append("mkdirs<path> - make all directories in the path" + "\n");
        sb.append("end - ends program");

        return sb.toString();

    }

    private String dir() {
        StringBuilder sb = new StringBuilder();
        List<String> contents = Arrays.asList(actualDir.list());
        for (String element : contents) {
            sb.append(element + "\n");
        }
        return sb.toString();
    }

    private String mkDir(String name) {
        if (new File(actualDir.getAbsolutePath() + File.separator + name).mkdirs()) {
            return "slozka vytvorena";
        }
        return "slozka nebyla vytvorena";
    }

    private String mkdirs() {
        return "ok";
    }

    private String rename(String oldName, String newName) {
        File sourceFile = new File(oldName);
        File destFile = new File(newName);

        if (sourceFile.renameTo(destFile)) {
            return ("File renamed successfully");
        } else {
            return "Failed to rename file";
        }

    }

    private String end() {
        System.exit(0);
        return "aplikace ukoncena";
    }

    private String cd(String path) {
       
    }
    
private String cd2(String path) {
       
    }
}
