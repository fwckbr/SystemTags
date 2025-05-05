package br.nextdev.tag.TagManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagsCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§cComando permitido somente para jogadores.");
        }else{
            Player p = (Player) sender;
                if(args.length == 0){
                    if (p.hasPermission("*")){
                        p.sendMessage("§aSuas tags: §cAdmin§f, §5Mod+§f, §5Mod§f, §5Trial§f, §2Builder§f, §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.mod+")){
                        p.sendMessage("§aSuas tags: §5Mod+§f, §5Mod§f, §5Trial§f, §2Builder§f, §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.mod")){
                        p.sendMessage("§aSuas tags: §5Mod§f, §5Trial§f, §2Builder§f, §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.trial")){
                        p.sendMessage("§aSuas tags: §5Trial§f, §2Builder§f, §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.builder")){
                        p.sendMessage("§aSuas tags: §2Builder§f, §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.destaque")){
                        p.sendMessage("§aSuas tags: §eDestaque§f, §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.CREATOR")){
                        p.sendMessage("§aSuas tags: §bYoutuber§f, §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.streamer")){
                        p.sendMessage("§aSuas tags: §bStreamer§f, §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.TIKTOK")){
                        p.sendMessage("§aSuas tags: §bTIKTOK§f, §1Beta§f, §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.beta")) {
                        p.sendMessage("§aSuas tags: §1Beta§8, §cElite§8, §aVip§8, §7Membro§8.");
                    }else if (p.hasPermission("tag.pro")){
                        p.sendMessage("§aSuas tags: §6Pro§f, §aVip§f, §7Membro§f.");
                    }else if (p.hasPermission("tag.vip")){
                        p.sendMessage("§aSuas tags: §aVip§8, §7Membro§8.");
                    }else if (p.hasPermission("tag.membro")){
                        p.sendMessage("§aSuas tags: §7Membro§8.");
                    }
                    return true;
                }
            }
        return false;
    }
}
