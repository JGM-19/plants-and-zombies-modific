// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class TangleKelp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tanglekelp"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart right_kelp;
	private final ModelPart right_kelp2;
	private final ModelPart left_kelp;
	private final ModelPart left_kelp2;
	private final ModelPart left_top_kelp;
	private final ModelPart left_top_kelp2;
	private final ModelPart right_top_kelp;
	private final ModelPart right_top_kelp2;
	private final ModelPart left_bottom_kelp;
	private final ModelPart left_bottom_kelp2;
	private final ModelPart right_bottom_kelp;
	private final ModelPart right_bottom_kelp2;
	private final ModelPart roots;

	public TangleKelp(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.right_kelp = this.body.getChild("right_kelp");
		this.right_kelp2 = this.right_kelp.getChild("right_kelp2");
		this.left_kelp = this.body.getChild("left_kelp");
		this.left_kelp2 = this.left_kelp.getChild("left_kelp2");
		this.left_top_kelp = this.body.getChild("left_top_kelp");
		this.left_top_kelp2 = this.left_top_kelp.getChild("left_top_kelp2");
		this.right_top_kelp = this.body.getChild("right_top_kelp");
		this.right_top_kelp2 = this.right_top_kelp.getChild("right_top_kelp2");
		this.left_bottom_kelp = this.body.getChild("left_bottom_kelp");
		this.left_bottom_kelp2 = this.left_bottom_kelp.getChild("left_bottom_kelp2");
		this.right_bottom_kelp = this.body.getChild("right_bottom_kelp");
		this.right_bottom_kelp2 = this.right_bottom_kelp.getChild("right_bottom_kelp2");
		this.roots = this.body.getChild("roots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -2.2333F, -3.025F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.5F, -2.4833F, -3.525F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-4.0F, -3.2333F, -3.025F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(2.0F, 1.0167F, -1.025F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).addBox(3.0F, -2.2333F, 1.975F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 22).mirror().addBox(-6.0F, 1.7667F, 1.975F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.2333F, 0.025F));

		PartDefinition right_kelp = body.addOrReplaceChild("right_kelp", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition right_kelp2 = right_kelp.addOrReplaceChild("right_kelp2", CubeListBuilder.create().texOffs(16, 22).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition left_kelp = body.addOrReplaceChild("left_kelp", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition left_kelp2 = left_kelp.addOrReplaceChild("left_kelp2", CubeListBuilder.create().texOffs(28, 12).addBox(0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_top_kelp = body.addOrReplaceChild("left_top_kelp", CubeListBuilder.create().texOffs(32, 3).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 3.0F));

		PartDefinition left_top_kelp2 = left_top_kelp.addOrReplaceChild("left_top_kelp2", CubeListBuilder.create().texOffs(16, 28).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition right_top_kelp = body.addOrReplaceChild("right_top_kelp", CubeListBuilder.create().texOffs(32, 7).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, 3.0F));

		PartDefinition right_top_kelp2 = right_top_kelp.addOrReplaceChild("right_top_kelp2", CubeListBuilder.create().texOffs(16, 31).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(0.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition left_bottom_kelp = body.addOrReplaceChild("left_bottom_kelp", CubeListBuilder.create().texOffs(32, 5).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, -3.0F));

		PartDefinition left_bottom_kelp2 = left_bottom_kelp.addOrReplaceChild("left_bottom_kelp2", CubeListBuilder.create().texOffs(28, 18).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition right_bottom_kelp = body.addOrReplaceChild("right_bottom_kelp", CubeListBuilder.create().texOffs(32, 9).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-2.5F, -1.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, -3.0F));

		PartDefinition right_bottom_kelp2 = right_bottom_kelp.addOrReplaceChild("right_bottom_kelp2", CubeListBuilder.create().texOffs(32, 0).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition roots = body.addOrReplaceChild("roots", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}