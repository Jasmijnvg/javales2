public class ApplePieRecipe {

    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient bastardSuiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetzureAppels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public ApplePieRecipe() {
        printIngredienten();
        verwarmOven();
        klopEi();
        mengen();
        schillen();
        invetten();
        bedekBodem();
        appelsInVorm();
        rolLaatsteDeeg();
        strokenOpTaart();
        taartInOven();
    }

    public void printIngredienten(){
        System.out.println("Ingredienten");
        System.out.println(roomboter.getAmount()+ " "+roomboter.getUnit()+" "+roomboter.getName());
        System.out.println(bastardSuiker.getAmount()+ " "+bastardSuiker.getUnit()+" "+bastardSuiker.getName());
        System.out.println(zelfrijzendBakmeel.getAmount()+ " "+zelfrijzendBakmeel.getUnit()+" "+zelfrijzendBakmeel.getName());
        System.out.println(ei.getAmount()+ " "+ei.getUnit()+" "+ei.getName());
        System.out.println(vanillesuiker.getAmount()+ " "+vanillesuiker.getUnit()+" "+vanillesuiker.getName());
        System.out.println(zout.getAmount()+ " "+zout.getUnit()+" "+zout.getName());
        System.out.println(zoetzureAppels.getAmount()+ " "+zoetzureAppels.getUnit()+" "+zoetzureAppels.getName());
        System.out.println(kristalSuiker.getAmount()+ " "+kristalSuiker.getUnit()+" "+kristalSuiker.getName());
        System.out.println(kaneel.getAmount()+ " "+kaneel.getUnit()+" "+kaneel.getName());
        System.out.println(paneermeel.getAmount()+ " "+paneermeel.getUnit()+" "+paneermeel.getName());
        System.out.println(" ");
        System.out.println("Stappen");

    }

    public void verwarmOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void klopEi() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mengen() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void schillen() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void invetten() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void bedekBodem() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void appelsInVorm() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void rolLaatsteDeeg() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void strokenOpTaart() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void taartInOven() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}
