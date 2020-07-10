package postcardddd.orderpostcard.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import postcardddd.orderpostcard.domain.model.Image;
import postcardddd.orderpostcard.service.ImageService;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/images")
public class ImageApi {

    private final ImageService imageService;

    public ImageApi(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Image saveImage(@RequestBody Image image,
                           HttpServletResponse response) {

        Image result = this.imageService.saveImage(image.getId(), image.getPostcardId(), image.getImage());
        response.setHeader("Location", "/api/images");

        return result;
    }

    @GetMapping(path = "/byPostcardId")
    public Image getImageByPostcardId(@RequestParam String postcardId) {
        return this.imageService.getAllImagesForPostcard(postcardId).get(0);
    }

}
