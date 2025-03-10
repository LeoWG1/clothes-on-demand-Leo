package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Skirt;

public class SkirtCommand implements ProductDecorationCommand {
    private final Skirt skirt;
    private final double waistline;
    private final String pattern;

    public SkirtCommand(Skirt skirt, double waistline, String pattern) {
        this.skirt = skirt;
        this.waistline = waistline;
        this.pattern = pattern;
    }

    @Override
    public void execute() {
        skirt.setWaistline(waistline);
        skirt.setPattern(pattern);
        System.out.println("Syr till midje-storlek: " + skirt.getWaistline() + "cm...\nLägger till mönster: "
        + skirt.getPattern() +"...");
    }
}
