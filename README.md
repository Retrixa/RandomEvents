# RandomEvents
>Current Version: 0.1

<img align="centre" alt="Project Image" width="175px" src="https://i.imgur.com/wJSWuuN.png" />

<br />

> Spigot based plugin in order to add Random-Events to the server in order to provide legitimate players a reward and to mitigate illegitimate players.

---

### Contents
- [Description](#description)
- [Usage](#usage)
- [Commands](#commands)
- [Permissions](#permissions)
- [Links](#links)

---

## Description

RandomEvents is a plugin that is designed to challenge players on a random basis in order to assist in determining between legitimate and illegitimate players with a customisable reward system for players who successfully complete the event!

The theory behind this plugin is known bots should lack the capability immediately to react to such events and therefore may flag for investigation based on a number of event failures. While legitimate players should have little difficulty in solving these events, and in-turn will receive a reward for their activity on the server.

## Usage

RandomEvents is designed in such a way that it allows for simple "Plug-and-Play" which means there is little setup required in order to have a functioning version of this on your server!

There are however some optional configuration and settings that you may wish to configure to provide a more unique experience to your users.

#### Optional Configuration

- **Configurable Information**
  - Messages - *All messages within the plugin are configurable with HEX support!*
  - Prefix - *As with messages, the prefix to them is also configurable with added HEX support.*

- **Event Frequency**
  - *Within the configuration you may alter the frequency of events to suit the needs of your server, this will affect how often a random event is provided to players.*

## Commands

While this plugin is designed to require little input to function, there are a handful of administrative commands which may assist in its function.
The commands are all accessible through the command alias "/rev"

- **/randomevents spawn (player)**
  - Force a random event for the specified player.
- **/randomevents view (player)**
  - View the success/fail for the specified player.
- **/randomevents reload**
  - Reload the plugin configuration. Particularly useful for live-config changes.

## Permissions

There are a small number of permissions for the administration of RandomEvents.

- **randomevents.admin**
  - The admin permission allows the user access to all features of the plugin.
- **randomevents.view**
  - This permission allows the user access to the " ***/randomevents view*** " command.
- **randomevents.spawn**
  - This permission allows the user access to the " ***/randomevents spawn*** " command.
- **randomevents.bypass**
  - This permission prevents the user from having random-events spawn.

---

## Links

Useful links for this plugin!

If you find this plugin a useful addition to your server, consider [buying a coffee](https://www.buymeacoffee.com/retrixa) for the developers!

You can find support for this plugin at our Official Discord [Here](https://discord.com/invite/KNFD3KdfEA)

Thank you!
