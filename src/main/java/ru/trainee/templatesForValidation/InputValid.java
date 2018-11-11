package ru.trainee.templatesForValidation;

import javax.validation.constraints.Pattern;

public class InputValid {
    private Long id;
    @Pattern(regexp = "^[0-9]*[.,][0-9]+$", message = "Invalid number format for temperature")
    private String temperature;
    @Pattern(regexp = "^[0-9]*[.,][0-9]+$", message = "Invalid number format for coordinate x")
    private String x;
    @Pattern(regexp = "^[0-9]*[.,][0-9]+$", message = "Invalid number format for coordinate y")
    private String y;

    public Long getId() {
        return id;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public Double getDoubleTemperature(){
        return Double.parseDouble(temperature.replace(',', '.'));
    }

    public Double getDoubleX(){
        return Double.parseDouble(x.replace(',', '.'));
    }

    public Double getDoubleY(){
        return Double.parseDouble(y.replace(',', '.'));
    }
}