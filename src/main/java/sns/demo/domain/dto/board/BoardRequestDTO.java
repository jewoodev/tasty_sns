package sns.demo.domain.dto.board;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardRequestDTO {
    @NotBlank(message = "제목을 입력해주세요.")
    @Size(min = 2, max = 20, message = "제목은 2 ~ 20자 사이로 입력해주세요.")
    private String title;

    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

    private List<MultipartFile> boardImages;
}
