package captainer;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class MyselectImport implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata);
        return new String[]{"captainer.Tiger"};
    }
}
