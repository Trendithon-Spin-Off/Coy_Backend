package Trendithon.SpinOff.domain.member.entity;

import Trendithon.SpinOff.global.jwt.entity.Authority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String memberId;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    private Authority authority;
    private Boolean activate;
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    public boolean isActivated() {
        return activate;
    }
}
