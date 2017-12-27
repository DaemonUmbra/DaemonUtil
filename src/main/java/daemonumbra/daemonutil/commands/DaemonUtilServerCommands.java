package daemonumbra.daemonutil.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.List;

public class DaemonUtilServerCommands extends CommandBase{

    private List<String> aliases;
    private List<String> tab;

    public DaemonUtilServerCommands()
    {
        aliases = new ArrayList<String>();
        aliases.add("DaemonUtil");
        aliases.add("DUtil");

        tab = new ArrayList<String>();
        tab.add("playsound");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getUsage(ICommandSender iCommandSender) {
        return null;
    }

    @Override
    public void execute(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] strings) throws CommandException {

    }
}
