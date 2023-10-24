/** Exercise 4.3 */

public class GeographyAreas {
    public static void main(String[] args) {
        double AtlantaX = 33.7489954;
        double AtlantaY = -84.3879824;
        
        double CharlotteX = 35.2270869;
        double CharlotteY = -80.8431267;
        
        double SavannahX = 32.0835407;
        double SavannahY = -81.0998342;
        
        double OrlandoX = 28.5383355;
        double OrlandoY = -81.3792365;
        
        double radius = 6371.01;
        
        double AC = radius * Math.acos(Math.sin(AtlantaX) * Math.sin(CharlotteX)
                + (Math.cos(AtlantaX) * Math.cos(CharlotteX) * 
                        Math.cos(AtlantaY - CharlotteY)));
        
        double CS = radius * Math.acos(Math.sin(CharlotteX) * 
                Math.sin(SavannahX) + (Math.cos(CharlotteX) * 
                    Math.cos(SavannahX) * Math.cos(CharlotteY - SavannahY)));
        
        double OS = radius * Math.acos(Math.sin(OrlandoX) * Math.sin(SavannahX)
                + (Math.cos(OrlandoX) * Math.cos(SavannahX) * 
                        Math.cos(OrlandoY - SavannahY)));
        
        double AO = radius * Math.acos(Math.sin(AtlantaX) * Math.sin(OrlandoX)
                + (Math.cos(AtlantaX) * Math.cos(OrlandoX) * 
                        Math.cos(AtlantaY - OrlandoY)));
        
        double AS = radius * Math.acos(Math.sin(AtlantaX) * Math.sin(SavannahX)
                + (Math.cos(AtlantaX) * Math.cos(SavannahX) * 
                        Math.cos(AtlantaY - SavannahY)));
        
        double ACS = (AC + CS + AS) / 2.0;
        double AOS = (AO + OS + AS) / 2.0;
        double areaACS = Math.sqrt(ACS * (ACS - AC) * (ACS - CS) * (ACS - AS));
        double areaAOS = Math.sqrt(AOS * (AOS - AO) * (AOS - OS) * (AOS - AS));
        double area = areaACS + areaAOS;
        System.out.println("The area enclosed by Atlanta, Georgia; Orlando,"
                + " Florida; Savannah, Georgia");
        System.out.println("and Charlotte, North Carolina is: " + 
                Math.round(area * 100) / 100.00 + " km");
    }
}
