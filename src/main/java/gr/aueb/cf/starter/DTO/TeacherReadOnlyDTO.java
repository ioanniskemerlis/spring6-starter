package gr.aueb.cf.starter.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeacherReadOnlyDTO {
    private Long id;
    private String firstname;
    private String lastname;
}
