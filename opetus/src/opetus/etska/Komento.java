package opetus.etska;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Komento implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("komento")) {
			if (sender instanceof Player) {
				if(sender.hasPermission("komento.use")) {
					sender.sendMessage("hello");
				}
				else {
					sender.sendMessage("you do not have permission to use this command please contact server adminnistrator if you have any issue");
				}
			}
			else {
				sender.sendMessage("only players may execute this command");
			}
			
		}
		return false;
	}

}
