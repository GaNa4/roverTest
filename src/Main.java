import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ceconocomlg-e\\workspace\\testNada\\src\\input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        int x = Integer.parseInt(line.split(" ")[0]);
        int y = Integer.parseInt(line.split(" ")[1]);
        char orientation = line.split(" ")[2].charAt(0);
        Rover rover = new Rover(x,y,orientation);
        String line1 = reader.readLine();
        rover.setMouvement(line1);
        System.out.println(rover.x +" "+rover.y+" "+rover.direction);



    }
}
