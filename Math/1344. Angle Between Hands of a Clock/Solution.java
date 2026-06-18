class Solution {
    public double angleClock(int hour, int minutes) {
        double h=(hour*30)+(minutes*0.5);
        double m=minutes*6;
        double an=Math.abs(h-m);
        return Math.min(an,360-an);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int hour = 3;
        int minutes = 15;
        System.out.println("Angle between hands of clock at " + hour + ":" + minutes + " is: " + solution.angleClock(hour, minutes) + " degrees");
    }   
}