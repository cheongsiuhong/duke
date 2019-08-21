package duke.commands;

import duke.Duke;
import duke.tasks.Task;

public class DoneCommand extends Command {
    private static final String DONE_TASK_STRING = "Nice! I've marked this task as done:";

    private int index;

    public DoneCommand(Duke duke, String input) {
        super(duke, input);
        String[] args = input.split(" ");
        this.index = Integer.parseInt(args[1]);
    }

    public void execute() {
        Task doneTask = duke.getTasks().getTask(index);
        duke.getTasks().markDone(index);
        String message = String.format("%s\n\t%s", DONE_TASK_STRING, doneTask);
        duke.say(message);
    }

}
