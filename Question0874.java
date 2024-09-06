import java.util.HashSet;
import java.util.Set;

public class Question0874{
    public static void main(String[] args) {
        int[] commande = {-2,-1,8,9,6};
        int[][] obstacle = {{-1,3},{0,1},{-1,5},{-2,-4},{5,4},{-2,-3},{5,-1},{1,-1},{5,5},{5,2}};
        int distance =robotSim(commande,obstacle);
        System.out.println(distance);
    }

    // Helper method to convert coordinates to a string
    private static String coordinateToString(int x, int y) {
        return x + "," + y;
    }

    public static int [] rightRotation(int[] oldDirection){
        int[] newDirection = new int [2];
        // Rotation matrix for 90-degree counterclockwise rotation
        int[][] rotationMatrix = {
                {0, -1},
                {1, 0}
        };
        newDirection[0] = rotationMatrix[0][0] * oldDirection[0] + rotationMatrix[0][1] * oldDirection[1];
        newDirection[1] = rotationMatrix[1][0] * oldDirection[0] + rotationMatrix[1][1] * oldDirection[1];
        return newDirection;

    }
    public static int[] leftRotation(int[] oldDirection){
        int[] newDirection = new int [2];
        int[][] rotationMatrix = {
                {0, 1},
                {-1, 0}
        };
        newDirection[0] = rotationMatrix[0][0] * oldDirection[0] + rotationMatrix[0][1] * oldDirection[1];
        newDirection[1] = rotationMatrix[1][0] * oldDirection[0] + rotationMatrix[1][1] * oldDirection[1];
        return newDirection;
    }
    public static boolean validMovement(Set<String> obstacles, int[] futurePosition){
        if (obstacles.contains(coordinateToString(futurePosition[1],futurePosition[0]))) {
           return false;
        } else {
            return true;
        }
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        Set<String> coordinateSet = new HashSet<>();
        for (int[] coordinate : obstacles) {
            coordinateSet.add(coordinateToString(coordinate[0], coordinate[1]));
        }
        int[] direction = {1,0};
        int[] position = {0,0};
        int[] futurePosition = {0,0};
        int maxDistance = 0;
        for(int i = 0 ; i < commands.length; i++){
            futurePosition[0] = position[0];
            futurePosition[1] = position[1];
            switch(commands[i]){
                case -1:
                    direction=rightRotation(direction);
                    break;
                case -2:
                    direction=leftRotation(direction);
                    break;
                case 9:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }

                case 8:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 7:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 6:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 5:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 4:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 3:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]=position[0]+direction[0];
                        position[1]=position[1]+direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 2:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]=position[0]+direction[0];
                        position[1]=position[1]+direction[1];
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
                case 1:
                    futurePosition[0] = futurePosition[0]+direction[0];
                    futurePosition[1] = futurePosition[1]+direction[1];
                    if(validMovement(coordinateSet,futurePosition)){
                        position[0]+=direction[0];
                        position[1]+=direction[1];
                        System.out.println("X "+position[0]+" Y "+position[1]);
                        if(maxDistance<position[0]*position[0]+position[1]*position[1]){
                            maxDistance= position[0]*position[0]+position[1]*position[1];
                        }
                    }
                    else{
                        System.out.println("X "+position[0]+" Y "+position[1]+" was blocked");
                        break;
                    }
            }
        }
        return maxDistance;
    }
}


