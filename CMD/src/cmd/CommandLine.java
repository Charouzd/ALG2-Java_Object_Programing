package cmd;

import java.io.File;

public class CommandLine {
    private String command;
    private File actualDir;

    public CommandLine(){
        actualDir = new File(System.getProperty("user.dir"));
    }

	public String getActualDir() {
        return actualDir.getAbsolutePath();
	}

	public String parseAndExecute(String command) {
		String[] parts = command.trim().split(" ");
        String result;
        switch(parts[0]){
            case "mkfile": result = mkfile(parts[1]);
            case "help": result = help();
            default:
                result = "Nevalidni prikaz";
        }
        return result;
	}

    private String mkfile(String filename){
        File f = new File(actualDir.getAbsolutePath() + File.separator + filename);
        //File f = new File(actualDir, filename);
        if(f.createNewFile()){
            return "Soubor vytvoren";
        } else {
            return "Soubor uz existuje";
        }
    }

	public boolean isEnd() {
		return false;
	}

    private String help() {
       
    }

}
