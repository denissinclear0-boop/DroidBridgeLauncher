    private void updateAccountStatus(@Nullable AccountStore.Account account) {
        boolean hasRememberedMicrosoft = accountStore != null && accountStore.hasStoredMicrosoftAccount();
        boolean activeOffline = account != null && account.isOfflineAccount();
        boolean activeMicrosoft = account != null && account.isMicrosoftAccount();

        // ✅ MODIFICADO: Permite acceder a cuentas offline sin Microsoft login
        binding.buttonSignIn.setVisibility(hasRememberedMicrosoft ? View.GONE : View.VISIBLE);
        binding.buttonSignOut.setVisibility((hasRememberedMicrosoft || account != null) ? View.VISIBLE : View.GONE);
        // ✅ CAMBIO: Permite manage offline accounts SIN requerir Microsoft login primero
        binding.buttonManageOfflineAccounts.setVisibility(View.VISIBLE);
        binding.buttonManageOfflineAccounts.setEnabled(true);
        binding.buttonUseMicrosoftAccount.setVisibility(hasRememberedMicrosoft && activeOffline ? View.VISIBLE : View.GONE);
        binding.buttonRefreshMicrosoftSkin.setVisibility(hasRememberedMicrosoft ? View.VISIBLE : View.GONE);
        binding.buttonRefreshMicrosoftSkin.setEnabled(hasRememberedMicrosoft);

        if (activeOffline) {
            String microsoftName = "Microsoft account";
            AccountStore.Account remembered = accountStore != null ? accountStore.loadLastMicrosoftAccount() : null;
            if (remembered != null) microsoftName = remembered.getBestDisplayName();
            binding.textAccountStatus.setText(getString(R.string.status_offline_account_with_microsoft, account.getBestDisplayName(), microsoftName));
            return;
        }

        if (activeMicrosoft) {
            binding.textAccountStatus.setText(getString(R.string.status_signed_in, account.getBestDisplayName()));
            return;
        }

        if (hasRememberedMicrosoft) {
            AccountStore.Account remembered = accountStore.loadLastMicrosoftAccount();
            String name = remembered != null ? remembered.getBestDisplayName() : "Microsoft Player";
            binding.textAccountStatus.setText(getString(R.string.status_microsoft_remembered, name));
            return;
        }

        // ✅ NUEVO: Muestra opción para crear cuenta offline sin Microsoft
        binding.textAccountStatus.setText(R.string.status_offline_available);
    }
