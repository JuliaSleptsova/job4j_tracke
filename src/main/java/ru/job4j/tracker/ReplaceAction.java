package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Edit item");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name item: ");
        Item item = new Item(name);
        boolean rsl = tracker.replace(id, item);
        if (rsl) {
            out.println("Successful");
        } else {
            out.println("id not found");
        }
        return true;
    }
}
