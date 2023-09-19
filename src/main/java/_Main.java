public class _Main {

    public static void main(String[] args) {
         Status.getStatus();
         Region region = new Region("Татарстан", 10000);
         District district = new District("Верхнеуслонский", 1000);
         City city = new City("Иннополис", 500);
         Status.addStructures(region);
         Status.addStructures(district);
         Status.addStructures(city);
         System.out.println("Мое государство: \n" + Status.getName());
         System.out.println("Мой " + Status.getStructure(0).toString().split("@")[0] + ":");
         System.out.println(Status.getStructureName(0));
         System.out.println("Мой " + Status.getStructure(1).toString().split("@")[0]+ ":");
         System.out.println(Status.getStructureName(1));
         System.out.println("Мой " + Status.getStructure(2).toString().split("@")[0]+ ":");
         System.out.println(Status.getStructureName(2));
    }

}
