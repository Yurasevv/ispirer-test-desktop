package com.ispirer;

import com.ispirer.button.PopupMessageButton;
import com.ispirer.label.PopupMessageLabel;

public class ElementInitializer {
    private PopupMessageButton popupMessageButton = new PopupMessageButton();
    private PopupMessageLabel popupMessageLabel = new PopupMessageLabel();

    public ElementInitializer() {
    }

    public PopupMessageButton getPopupMessageButton() {
        return popupMessageButton;
    }

    public void setPopupMessageButton(PopupMessageButton popupMessageButton) {
        this.popupMessageButton = popupMessageButton;
    }

    public PopupMessageLabel getPopupMessageLabel() {
        return popupMessageLabel;
    }

    public void setPopupMessageLabel(PopupMessageLabel popupMessageLabel) {
        this.popupMessageLabel = popupMessageLabel;
    }
}
