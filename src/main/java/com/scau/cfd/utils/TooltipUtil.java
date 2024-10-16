package com.scau.cfd.utils;

import com.scau.cfd.controller.MainController;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import org.kordamp.ikonli.ionicons.Ionicons;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.Objects;

/**
 * 这个类是：给组件设置悬浮添加提示的
 *
 * @author: William
 * @date: 2024-10-07T20:20:51CST 20:20
 * @description:
 */
public class TooltipUtil {
    private static final ImageView imageView = new ImageView(new Image(Objects.requireNonNull(
            MainController.class.getResourceAsStream("/images/康纳.jpg")), 50, 50, false, false));

    public static void insertTooltip(Control control, String text) {
        Tooltip tooltip = new Tooltip("o(=•ェ•=)m：" + text);
        tooltip.setFont(new Font(20));
        tooltip.setGraphic(new FontIcon(Ionicons.ION_SOCIAL_OCTOCAT) {{
            setIconColor(new Color(1, 1, 1, 1));
        }});
        control.setTooltip(tooltip);

        ((Label) control).textProperty().addListener((observable, oldValue, newValue) -> {
            Tooltip tooltip1 = new Tooltip("o(=•ェ•=)m：" + newValue);
            tooltip1.setFont(new Font(20));
            tooltip.setGraphic(new FontIcon(Ionicons.ION_SOCIAL_OCTOCAT));
            control.setTooltip(tooltip1);
        });
    }
}
