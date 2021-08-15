package home_work_4;

import java.time.LocalDate;

public class MaterialManager implements Discount{

    private Material[] materials = new Material[0];

    public MaterialManager() {

    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public void addMaterial(Material[] materials) {
        Material[] newMaterials = new Material[this.materials.length + materials.length];
        for (int i = 0; i < newMaterials.length; i++) {
            if (i < this.materials.length) {
                newMaterials[i] = this.materials[i];
            } else {
                newMaterials[i] = materials[i - this.materials.length];
            }
        }
        this.materials = newMaterials;
    }

    public boolean hasMaterials(Material material) {
        boolean result = false;
        for (Material value : materials) {
            if (value.equals(material)) {
                result = true;
            }
        }
        return result;
    }

    public Material[] deleteMaterial(Material material) {
        Material[] newMaterial = new Material[materials.length - 1];
        int index = 0;
        for (Material value : materials) {
            if (material.equals(value)) {
                continue;
            }
            newMaterial[index] = value;
            index++;
        }
        materials = newMaterial;
        return materials;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    public double discount() {
        double total = 0;
        for (int i = 0; i < materials.length; i++) {
            int expirationDate = materials[i].getExpiryDate().getDayOfMonth();
            int expirationMonth = materials[i].getExpiryDate().getMonthValue();
            int expirationYear = materials[i].getExpiryDate().getYear();
            int nowToday = LocalDate.now().getDayOfMonth();
            int nowMonth = LocalDate.now().getMonthValue();
            int nowYear = LocalDate.now().getYear();
            boolean togetherMonth = (nowMonth == expirationMonth);
            boolean togetherYear = (nowYear == expirationYear);


            if (materials[i] instanceof Meat) {
                if (togetherMonth && togetherYear && (expirationDate - nowToday) <= 3) {
                    total += materials[i].getAmount() * 0.7;
                } else if (togetherMonth && togetherYear && (expirationDate - nowToday) <= 5) {
                    total += materials[i].getAmount() * 0.5;
                } else {
                    total += materials[i].getAmount() * 0.9;
                }
            }

            if (materials[i] instanceof CrispyFlout) {
                if (togetherYear && nowMonth - expirationMonth <= 2 && nowToday - expirationDate < 0) {
                    total += materials[i].getAmount() * 0.8;
                } else if (togetherYear && nowMonth - expirationMonth <= 4 && nowToday - expirationDate < 0) {
                    total += materials[i].getAmount() * 0.6;
                } else {
                    total += materials[i].getAmount() * 0.8;
                }
            }
        }
        return total;
    }


}
