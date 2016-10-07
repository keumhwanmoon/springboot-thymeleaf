package jason.thymeleaf.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author jason, Moon
 * @since 2016-10-07
 */
@Getter
@Setter
public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
