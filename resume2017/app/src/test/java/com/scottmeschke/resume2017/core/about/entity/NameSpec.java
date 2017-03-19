package com.scottmeschke.resume2017.core.about.entity;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Scott on 3/18/2017.
 */

public class NameSpec {

    @Test
    public void whenConstructing_throwsWithNullArgs(){
        boolean threwException = false;

        try {
            Name belcher = new Name(null, "belcher");
        } catch (Exception e) {
            threwException = true;
        }

        assertThat(threwException).isTrue();
        threwException = false;

        try {
            Name bob = new Name("bob", null);
        } catch (Exception e) {
            threwException = true;
        }

        assertThat(threwException).isTrue();
    }

    @Test
    public void gettersMatchConstruction(){
        Name bobBelcher = new Name("bob", "belcher");
        assertThat(bobBelcher.getFirst()).isEqualTo("bob");
        assertThat(bobBelcher.getLast()).isEqualTo("belcher");
    }

    @Test
    public void toStringHasAllFields(){
        Name bobBelcher = new Name("bob", "belcher");
        assertThat(bobBelcher.toString()).contains("bob");
        assertThat(bobBelcher.toString()).contains("belcher");
    }

    @Test
    public void equals_whenFieldsEqual(){
        Name n1 = new Name("bob", "belcher");
        Name n2 = new Name("bob", "belcher");
        assertThat(n1).isEqualTo(n2);
    }

    @Test
    public void notEquals_whenFieldsNotEqual(){
        Name n1 = new Name("bob", "belcher");
        Name n2 = new Name("tina", "belcher");
        assertThat(n1).isNotEqualTo(n2);
    }

    @Test
    public void hashCodeEquals_whenInstancesEqual(){
        Name n1 = new Name("bob", "belcher");
        Name n2 = new Name("bob", "belcher");
        assertThat(n1.hashCode()).isEqualTo(n2.hashCode());
    }

    @Test
    public void hashCodeDifferent_whenInstancesNotEqual(){
        Name n1 = new Name("bob", "belcher");
        Name n2 = new Name("tina", "belcher");
        assertThat(n1.hashCode()).isNotEqualTo(n2.hashCode());
    }
}
