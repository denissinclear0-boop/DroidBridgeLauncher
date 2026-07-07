    private void showOfflineAccountsDialog() {
        // ✅ MODIFICADO: Ya NO requiere Microsoft login para acceder a cuentas offline
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(false);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        int padding = dp(24);
        root.setPadding(padding, dp(18), padding, dp(4));
        scrollView.addView(root, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT,
                ScrollView.LayoutParams.WRAP_CONTENT
        ));

        root.addView(buildDialogHeader(
                R.drawable.ic_player_head_placeholder,
                R.string.offline_accounts_title,
                R.string.offline_accounts_dialog_summary
        ));

        TextView sectionTitle = new TextView(this);
        sectionTitle.setText(R.string.offline_accounts_section_title);
        sectionTitle.setTextAppearance(android.R.style.TextAppearance_Material_Medium);
        sectionTitle.setTypeface(sectionTitle.getTypeface(), android.graphics.Typeface.BOLD);
        LinearLayout.LayoutParams sectionParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        sectionParams.topMargin = dp(18);
        root.addView(sectionTitle, sectionParams);

        ArrayList<AccountStore.Account> accounts = accountStore != null ? accountStore.listOfflineAccounts() : new ArrayList<>();
        if (accounts.isEmpty()) {
            root.addView(buildEmptyOfflineAccountCard());
        } else {
            AccountStore.Account active = accountStore != null ? accountStore.load() : null;
            for (AccountStore.Account offline : accounts) {
                root.addView(buildOfflineAccountRow(offline, active));
            }
        }

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(scrollView)
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(R.string.offline_account_add, null)
                .create();

        dialog.setOnShowListener(dialogInterface -> dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(view -> {
            dialog.dismiss();
            showEditOfflineAccountDialog(null);
        }));
        offlineAccountsDialog = dialog;
        dialog.setOnDismissListener(d -> { if (offlineAccountsDialog == dialog) offlineAccountsDialog = null; });
        dialog.show();
    }
