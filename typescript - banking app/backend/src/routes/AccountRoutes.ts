import { Router } from "express";
import { getAllAccounts, depositAmount, withdrawAmount } from "../controllers/AccountController";

const router = Router();

router.get("/", getAllAccounts);
router.post("/deposit", depositAmount);
router.post("/withdraw", withdrawAmount);

export default router;
