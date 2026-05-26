<p align="center">
  <img src="docs/app_icon.png" alt="DroidBridge Launcher" width="128" height="128">
</p>

<h1 align="center">DroidBridge Launcher</h1>

<p align="center">
  A Minecraft: Java Edition launcher for Android devices.
</p>

<p align="center">
  <strong>NOT AN OFFICIAL MINECRAFT PRODUCT.</strong><br>
  <strong>NOT APPROVED AS AN OFFICIAL MINECRAFT PRODUCT, ENDORSED BY, SPONSORED BY, OR ASSOCIATED WITH MOJANG, MICROSOFT, XBOX, OR MINECRAFT.</strong>
</p>

---

## Important

DroidBridge Launcher is an independent project by **DNA Mobile Applications**.

The launcher is built for users who already own Minecraft: Java Edition and want to manage and launch their own local game installation on Android. DroidBridge Launcher does not include Minecraft game files, Minecraft assets, paid content, account tokens, or any other proprietary Mojang/Microsoft files.

Minecraft, Mojang, Microsoft, Xbox, and related names, services, trademarks, and assets belong to their respective owners. Users are responsible for following the Minecraft EULA, Minecraft Usage Guidelines, Microsoft Services Agreement, and any other terms that apply to their account, game copy, device, mods, resource packs, servers, or third-party content.

Other than any limited authentication or API access granted for Microsoft account sign-in, this project is not affiliated with, sponsored by, endorsed by, partnered with, or approved as an official Minecraft product by Mojang, Microsoft, Xbox, Minecraft, PojavLauncher, Boardwalk, Zalith Launcher, Amethyst, Fold Craft Launcher, or any other third-party launcher project.

## About

DroidBridge Launcher is a launcher-side Android compatibility project. It focuses on giving users a cleaner way to manage Minecraft: Java Edition installations, versions, instances, runtime components, renderers, controls, mods, resource packs, shader packs, worlds, logs, and launcher settings on Android.

The project may use, modify, adapt, or study open-source launcher work where the applicable license allows it. DroidBridge Launcher keeps third-party license obligations attached to the code they apply to, including notice preservation and source availability where required.

## Microsoft account sign-in

DroidBridge Launcher may support Microsoft account sign-in through Microsoft identity services.

Microsoft account sign-in or related Minecraft service/API access may require review, registration, allow-listing, or approval from Microsoft, Mojang, or their service teams before it is available in a production build. If that access has been granted, it applies only to the authentication or API access that was reviewed and allowed.

That limited authentication/API approval does not make DroidBridge Launcher an official Minecraft product, official launcher, Mojang partner, Microsoft partner, Xbox partner, or endorsed Minecraft service.

Users must use their own Microsoft/Minecraft account and are responsible for following the terms that apply to that account.

## Installation and game setup

DroidBridge Launcher is intended to help users install and manage their own Minecraft: Java Edition game files on their device after they have signed in or otherwise provided access allowed by the official services and terms.

Code written by DNA Mobile Applications for user-facing setup, game installation guidance, account sign-in, launcher flow, or related screens is written to respect the GNU license obligations of any GNU-licensed code it partially uses, modifies, or depends on. Where a file or feature is based on GPL/LGPL-covered code, DroidBridge Launcher treats the covered portions and modifications as remaining under the applicable GNU license terms.

DroidBridge Launcher does not grant a Minecraft license, bypass Minecraft ownership checks, distribute Minecraft, or replace the need for a legitimate copy of Minecraft: Java Edition.

## Language and translation support

Translations are welcome.

If translation files are included in this repository, contributors should keep wording clear, accurate, and respectful of the legal notices above. Avoid implying official Mojang, Microsoft, Xbox, Minecraft, or third-party launcher approval in any language.

## Build instructions

> This section is for developers who want to build the project locally.

### Requirements

- Android Studio
- Android SDK with the project-supported minimum and target API levels
- JDK required by the current Gradle/Android plugin setup
- Git

### Build steps

```bash
git clone https://github.com/DNAMobileApplications/DroidBridgeLauncher.git
cd DroidBridgeLauncher
./gradlew assembleDebug
```

On Windows:

```bat
git clone https://github.com/DNAMobileApplications/DroidBridgeLauncher.git
cd DroidBridgeLauncher
gradlew.bat assembleDebug
```

Release builds should be signed with your own release keystore. Do not publish builds containing private credentials, signing material, API keys, local machine paths, account tokens, or debug-only configuration.

## License

DroidBridge Launcher is a mixed-origin source tree.

Files written entirely by **DNA Mobile Applications** are owned by DNA Mobile Applications unless a file header, license file, or notice says otherwise.

Files copied from, modified from, derived from, or based on third-party projects remain under their original license terms. This includes any code or modifications covered by GPL, LGPL, Apache-2.0, MIT, BSD, or other open-source licenses.

If this repository includes GPL/LGPL-covered code, the corresponding covered source code and DroidBridge Launcher modifications to that covered code must remain available under the applicable GNU license terms.

This README is not legal advice. Review the actual license files and third-party notices before redistributing APKs, publishing modified builds, or using this project commercially.

## Open source libraries and licenses

DroidBridge Launcher may use or reference open-source projects and libraries, including but not limited to:

| Project / Library | License | Link |
| --- | --- | --- |
| PojavLauncher | LGPL-3.0 unless otherwise stated by the upstream project | https://github.com/PojavLauncherTeam/PojavLauncher |
| Boardwalk | Apache-2.0 unless otherwise stated by the upstream project | https://github.com/zhuowei/Boardwalk |
| LWJGL | BSD-style license used by the LWJGL project | https://www.lwjgl.org |
| Mesa | MIT license used by Mesa components | https://www.mesa3d.org |
| GL4ES | MIT license unless otherwise stated by the upstream project | https://github.com/ptitSeb/gl4es |
| AndroidX / Android platform libraries | Apache-2.0 unless otherwise stated | https://developer.android.com |

See `OPEN_SOURCE_NOTICES.md`, `LICENSE`, and any license files included with third-party components for the full notices that apply to this repository.

## Privacy

DroidBridge Launcher is designed around local launcher data.

Launcher settings, logs, worlds, mods, resource packs, shader packs, instances, and related files are intended to stay on the user's device unless the user chooses to export, share, upload, back up, or send them through another app or service.

See `PRIVACY_POLICY.md` for the full privacy policy.

## Contributing

Contributions are welcome when they respect the project's code style, legal notices, and license requirements.

Do not submit copied code unless the license allows it and the original attribution is preserved. If a contribution is based on third-party code, make that clear in the pull request and keep the required notices with the affected files.

## Disclaimer

DroidBridge Launcher is not an official Minecraft product. Any Microsoft, Mojang, or Minecraft service/API access granted for account sign-in is limited to that reviewed authentication/API use only. It does not make DroidBridge Launcher an official launcher, official Minecraft product, endorsed service, or partner of Mojang, Microsoft, Xbox, or Minecraft.

This project does not include Minecraft, does not sell Minecraft, and does not provide any rights to Minecraft or other third-party content.