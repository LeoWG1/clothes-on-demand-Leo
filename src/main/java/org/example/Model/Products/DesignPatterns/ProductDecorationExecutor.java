package org.example.Model.Products.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class ProductDecorationExecutor {
    private final List<ProductDecorationCommand> commands = new ArrayList<>();

    public void addCommand(ProductDecorationCommand command) {
        commands.add(command);
    }
    public void executeCommands() {
        commands.forEach(ProductDecorationCommand::execute);
        commands.clear();
    }
}
