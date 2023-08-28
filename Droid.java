public class Droid
{ // Building a droid that drains battery everytime it performs a task
    String name;
    int batteryLevel;
    //constructor
    public Droid(String droidname, int bl)
    {
        name = droidname;
        batteryLevel = bl;

    }
    public void performTask(String task, int bl)
    {
        System.out.println(name+ " is performing the task: " +task);
        batteryLevel = bl - 10;
        System.out.println("The battery level is " +batteryLevel);
    }
    public void recharging(String task, int bl)
    {
        System.out.println(name + " is performing the task " +task);
        batteryLevel = bl + 10;
        System.out.println("The battery level is " +batteryLevel);
    }
    public static void main(String[] args)
    {
        Droid bot = new Droid("C3PO", 100);
        System.out.println("The battery level is " +bot.batteryLevel);
        bot.performTask("Dancing", bot.batteryLevel);
        bot.performTask("Running", bot.batteryLevel);
        bot.performTask("Cooking", bot.batteryLevel);
        bot.recharging("Self-mode charging", bot.batteryLevel);
        bot.recharging("Sleeping", bot.batteryLevel);
        bot.recharging("Resting", bot.batteryLevel);
    }
}