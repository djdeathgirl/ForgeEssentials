package com.ForgeEssentials.commands;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ICommandSender;
import net.minecraft.src.ServerConfigurationManager;

import com.ForgeEssentials.core.commands.ForgeEssentialsCommandBase;

public class CommandRestart extends ForgeEssentialsCommandBase
{

	private ServerConfigurationManager serverconfmgr;

	@Override
	public String getCommandName()
	{
		return "restart";
	}

	@Override
	public void processCommandPlayer(EntityPlayer sender, String[] args)
	{
	}

	@Override
	public void processCommandConsole(ICommandSender sender, String[] args)
	{
		sender.sendChatToPlayer("Not yet implemented");
		/**
		 * Not implemented sender.sendChatToPlayer("Restarting server..."); if (MinecraftServer.getServer().getNetworkThread() != null) { MinecraftServer.getServer().getNetworkThread().stopListening(); }
		 * 
		 * if (serverconfmgr != null) { sender.sendChatToPlayer("Saving players"); serverconfmgr.saveAllPlayerData(); serverconfmgr.removeAllPlayers(); }
		 * 
		 * sender.sendChatToPlayer("Saving worlds"); SaveUtil.saveGame(); WorldServer[] var1 = MinecraftServer.getServer().worldServers; int var2 = var1.length;
		 * 
		 * for (int var3 = 0; var3 < var2; ++var3) { WorldServer var4 = var1[var3]; MinecraftForge.EVENT_BUS.post(new WorldEvent.Unload(var4)); var4.flush(); DimensionManager.setWorld(var4.provider.dimensionId, null); } FMLRelauncher.handleServerRelaunch(new ArgsWrapper(args));
		 */
	}

	@Override
	public boolean canConsoleUseCommand()
	{
		return true;
	}

	@Override
	public boolean canPlayerUseCommand(EntityPlayer player)
	{
		return false;
	}

	@Override
	public String getCommandPerm()
	{
		return "ForgeEssentials.BasicCommands." + getCommandName();
	}

}
