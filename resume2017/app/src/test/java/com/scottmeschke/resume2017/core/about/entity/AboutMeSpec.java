package com.scottmeschke.resume2017.core.about.entity;

import com.google.common.collect.ImmutableList;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Scott on 3/18/2017.
 */

public class AboutMeSpec {

    private Name name;
    private int yearStarted;
    private String description;
    private ImmutableList<String> skills;

    @Before
    public void setUp(){
        name = new Name("bat", "man");
        yearStarted = 1921;
        description = "name punches villains";
        skills = ImmutableList.of("fighting", "driving", "talking");
    }

    @Test
    public void whenConstructing_doesNotAccept_anyParamNull(){
        boolean threwException = false;
        try {
            new AboutMe(null, yearStarted, description, skills);
        } catch (Exception e) {
            threwException = true;
        }

        assertThat(threwException).isTrue();

        threwException = false;
        try {
            new AboutMe(name, null, description, skills);
        } catch (Exception e) {
            threwException = true;
        }
        assertThat(threwException).isTrue();

        threwException = false;
        try {
            new AboutMe(name,yearStarted, null, skills);
        } catch (Exception e) {
            threwException = true;
        }

        assertThat(threwException).isTrue();

        threwException = false;
        try {
            new AboutMe(name,yearStarted, description, null);
        } catch (Exception e) {
            threwException = true;
        }

        assertThat(threwException).isTrue();
    }

    @Test
    public void whenGettingFields_matchesConstruction() {
        AboutMe aboutMe = new AboutMe(name, yearStarted, description, skills);
        assertThat(aboutMe.getName()).isEqualTo(name);
        assertThat(aboutMe.getAndroidStartYear()).isEqualTo(yearStarted);
        assertThat(aboutMe.getDescription()).isEqualTo(description);
        assertThat(aboutMe.getSkills()).isEqualTo(skills);
    }

    @Test
    public void toString_hasAllFields(){
        AboutMe aboutMe = new AboutMe(name, yearStarted, description, skills);
        assertThat(aboutMe.toString()).contains(name.toString());
        assertThat(aboutMe.toString()).contains(String.valueOf(yearStarted));
        assertThat(aboutMe.toString()).contains(description);
        assertThat(aboutMe.toString()).contains(skills.toString());
    }

    @Test
    public void equalsTrue_whenInstancesEquals(){
        AboutMe me1 = new AboutMe(name, yearStarted, description, skills);
        AboutMe me2 = new AboutMe(name, yearStarted, description, skills);
        assertThat(me1).isEqualTo(me2);
    }

    @Test
    public void equalsFalse_whenInstancesNotEquals(){
        AboutMe me1 = new AboutMe(name, yearStarted, description, skills);
        AboutMe me2 = new AboutMe(name, 7, description, skills);
        AboutMe me3 = new AboutMe(name, yearStarted, "something", skills);

        assertThat(me1).isNotEqualTo(me2);
        assertThat(me2).isNotEqualTo(me1);
        assertThat(me3).isNotEqualTo(me1);
    }

    @Test
    public void hashCodeEquals_whenInstancesEqual(){
        AboutMe me = new AboutMe(name, yearStarted, description, skills);
        AboutMe me2 = new AboutMe(name, yearStarted, description, skills);

        assertThat(me.hashCode()).isEqualTo(me2.hashCode());
    }

    @Test
    public void hashCodeNotEqual_whenInstancesNotEqual(){
        AboutMe me = new AboutMe(name, yearStarted, description, ImmutableList.of("hash"));
        AboutMe me2 = new AboutMe(name, yearStarted, description, skills);

        assertThat(me.hashCode()).isNotEqualTo(me2);
    }
}
